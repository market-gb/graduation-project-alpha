package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.CatalogConverter;
import ru.geekbrains.main.lesson_1.dto.CatalogDto;
import ru.geekbrains.main.lesson_1.entities.CatalogEntity;
import ru.geekbrains.main.lesson_1.exceptions.NotFoundCatalogException;
import ru.geekbrains.main.lesson_1.repositories.CatalogRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogService {
    private final CatalogRepository catalogRepository;
    private final CatalogConverter catalogConverter;

    public List<CatalogDto> findAll () {
        List<CatalogEntity> catalogEntities = catalogRepository.findAll();
        List<CatalogDto> catalogDtos = new ArrayList<>();
        catalogEntities.forEach(c -> catalogDtos.add(catalogConverter.entityToDto(c)));
        return catalogDtos;
    }

    public CatalogDto findById (Long id) {
        CatalogEntity catalogEntity = catalogRepository.findById(id)
                .orElseThrow(() -> new NotFoundCatalogException("Catalog with id=" + id + " not found"));
        return catalogConverter.entityToDto(catalogEntity);
    }

    public CatalogDto create (CatalogDto catalogDto) {
        catalogDto.setId(null);
        return catalogConverter.entityToDto(
                catalogRepository.save(catalogConverter.dtoToEntity(catalogDto))
        );
    }

    public CatalogDto update (CatalogDto catalogDto) {
        return catalogConverter.entityToDto(
                catalogRepository.save(catalogConverter.dtoToEntity(catalogDto))
        );
    }

    public void delete (Long id) {
        catalogRepository.deleteById(id);
    }

}
