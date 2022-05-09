package com.example.springintegration.integration.filewriter;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "textInChannel")
public interface FileWriter {

    void writeMessageToFile(@Header(FileHeaders.FILENAME) String fileName,
        String data);
}
