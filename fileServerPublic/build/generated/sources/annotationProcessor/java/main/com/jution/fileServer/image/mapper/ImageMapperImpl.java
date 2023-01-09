package com.jution.fileServer.image.mapper;

import com.jution.fileServer.image.dto.ImagePostDto;
import com.jution.fileServer.image.entity.Image;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-08T23:58:59+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 11.0.16 (Azul Systems, Inc.)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public Image imagePostDtoToImage(ImagePostDto imagePostDto) {
        if ( imagePostDto == null ) {
            return null;
        }

        Image image = new Image();

        image.setImageUrl( imagePostDto.getImageUrl() );

        return image;
    }
}
