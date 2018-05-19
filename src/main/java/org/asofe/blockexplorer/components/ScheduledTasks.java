package org.asofe.blockexplorer.components;

import org.asofe.blockexplorer.service.IndexBlocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private IndexBlocks indexBlocks;

    @Scheduled(fixedRate = 5000)
    public void index() {
        indexBlocks.startIndex();
    }
}
