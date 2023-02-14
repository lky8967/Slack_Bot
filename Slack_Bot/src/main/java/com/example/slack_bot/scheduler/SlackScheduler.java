package com.example.slack_bot.scheduler;

import com.example.slack_bot.SlackBot.SlackService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
@EnableScheduling
@Configuration
public class SlackScheduler {
    private final SlackService slackService;
    @Scheduled(cron="0 0/1 * * * *") //1분
    public void todayCocktail(){
        slackService.postSlackMessage("테스트");
    }
}
