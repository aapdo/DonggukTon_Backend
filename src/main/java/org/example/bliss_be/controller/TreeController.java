package org.example.bliss_be.controller;

import org.example.bliss_be.dto.ResponseDTO;
import org.example.bliss_be.dto.TreeDetailDTO;
import dto.TreeOverViewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.example.bliss_be.service.TreeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TreeController {
    private final TreeService treeService;

    @GetMapping("/tree/getdetail/{treeId}")
    public ResponseEntity<ResponseDTO<TreeDetailDTO>> getTreeDetail(@PathVariable Long treeId) {
        TreeDetailDTO treeDetailDTO = new TreeDetailDTO();
        treeDetailDTO.setTreeId(treeId);
        String msg = treeService.getTreeDetail(treeDetailDTO);
        ResponseDTO<TreeDetailDTO> response = ResponseDTO.<TreeDetailDTO>builder()
                .message(msg).data(treeDetailDTO).build();
        return ResponseEntity.ok().body(response);

    }
    @GetMapping("/tree/overview/{treeId}")
    public ResponseEntity<ResponseDTO<TreeOverViewDTO>> getTreeOverView(@PathVariable Long treeId) {
        TreeOverViewDTO treeOverViewDTO = new TreeOverViewDTO();
        treeOverViewDTO.setTreeId(treeId);
        String msg = treeService.getTreeOverView(treeOverViewDTO);
        ResponseDTO<TreeOverViewDTO> response = ResponseDTO.<TreeOverViewDTO>builder()
                .message(msg).data(treeOverViewDTO).build();
        return ResponseEntity.ok().body(response);
    }
}
