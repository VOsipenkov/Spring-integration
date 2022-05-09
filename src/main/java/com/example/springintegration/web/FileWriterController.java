package com.example.springintegration.web;

import com.example.springintegration.integration.filewriter.FileWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FileWriterController {
    private final FileWriter fileWriter;

    @PostMapping(value = "/message-to-file")
    public void post(@RequestBody String message) {
        fileWriter.writeMessageToFile("./temp/my-file.txt", message);
    }
}
