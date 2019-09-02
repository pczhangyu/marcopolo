package com.feecn.marcopolo.collect.processors;

import com.feecn.marcopolo.data.base.entity.ToOne;
import com.feecn.marcopolo.data.base.repository.ToOneRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class ResumeProcessor implements Runnable{

    private static Logger logger = LogManager.getLogger(ResumeProcessor.class);

    private ToOneRepository toOneRepository;

    public ResumeProcessor(ToOneRepository toOneRepository) {
        this.toOneRepository=toOneRepository;
    }

    @Override
    public void run() {
        List<ToOne> all = toOneRepository.findAll();
        logger.info("resumeList is {}",all);
    }
}
