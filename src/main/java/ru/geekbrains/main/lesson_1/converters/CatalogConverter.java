package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.CatalogDto;
import ru.geekbrains.main.lesson_1.entities.CatalogEntity;

@Component
public class CatalogConverter {

    public CatalogEntity dtoToEntity (CatalogDto catalogDto) {
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setId(catalogDto.getId());
        catalogEntity.setName(catalogDto.getName());
        return catalogEntity;
    }

    public CatalogDto entityToDto (CatalogEntity catalogEntity) {
        CatalogDto catalogDto = new CatalogDto();
        catalogDto.setId(catalogEntity.getId());
        catalogDto.setName(catalogEntity.getName());
        return catalogDto;
    }
}
