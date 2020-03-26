package com.ghs.projects.msscbeerservice.web.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
public class BeerDto {

    private final UUID id;
    private final Integer version;

    private final OffsetDateTime createDateTime;
    private final OffsetDateTime lastModifiedDate;

    private final String beerName;

    private final BeeerStyleEnum beeerStyle;

    private final Long upc;

    private final BigDecimal price;

    private final Integer quantityOnHand;

}
