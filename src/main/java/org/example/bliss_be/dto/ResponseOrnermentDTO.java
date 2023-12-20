package org.example.bliss_be.dto;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseOrnermentDTO {
    private Long ornamentId;
    private Boolean isGoodMemory;
    private String memory;
}
