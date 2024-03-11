package ru.clevertec.dto;

import lombok.Builder;
import lombok.experimental.FieldNameConstants;

import java.time.Instant;
import java.util.UUID;

@Builder
@FieldNameConstants
public record ProductDTO(UUID uuid,
                         String name,
                         Instant createDate,
                         Instant updateDate) {

}
