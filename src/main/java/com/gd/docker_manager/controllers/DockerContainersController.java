package com.gd.docker_manager.controllers;

import com.gd.docker_manager.services.DockerService;
import com.github.dockerjava.api.model.Container;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/containers")
public class DockerContainersController {

    private final DockerService dockerService;

    public DockerContainersController(DockerService dockerService) {
        this.dockerService = dockerService;
    }

    @GetMapping
    public List<Container> listImages(@RequestParam(required = false, defaultValue = "true") Boolean showAll) {
        return dockerService.listContainers(showAll);
    }

    @PostMapping("/{id}/start")
    public void startContainer(@PathVariable String id) {
        dockerService.startContainer(id);
    }

    @PostMapping("/{id}/stop")
    public void stopContainer(@PathVariable String id) {
        dockerService.stopContainer(id);
    }

    @DeleteMapping("/{id}")
    public void deleteContainer(@PathVariable String id) {
        dockerService.deleteContainer(id);
    }

    @PostMapping
    public void createContainer(@RequestParam String imageName) {
        dockerService.createContainer(imageName);
    }
}
