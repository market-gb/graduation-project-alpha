package ru.geekbrains.main.lesson_1.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.UserConverter;
import ru.geekbrains.main.lesson_1.dto.UserDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userConverter::entityToDto)
                .toList();
    }

    public UserDto getUserById(@NonNull Long id) {
        return userConverter
                .entityToDto(userRepository.findById(id)
                        .orElseThrow(() -> new ResourceException("User not found")));
    }

    public void saveUser(@NonNull UserDto userDto) {
        userRepository.save(userConverter.dtoToEntity(userDto));
    }

    public void deleteUserById(@NonNull Long id) {
        userRepository.deleteById(id);
    }
}
