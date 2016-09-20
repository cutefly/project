package com.kpcard.telegrambots;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

import com.kpcard.telegrambots.handler.CommandsHandler;
import com.kpcard.telegrambots.handler.MessageHandler;

@SpringBootApplication
public class KpcTelegramBotsApplication {

	private static final Logger logger = LoggerFactory
			.getLogger(KpcTelegramBotsApplication.class);

	@Autowired
	private TelegramBotsApi telegramBotsApi;
	
	@PostConstruct
	public void InitializeBot() {
        try {
        	telegramBotsApi.registerBot(new MessageHandler());
        	telegramBotsApi.registerBot(new CommandsHandler());
        } catch (TelegramApiException e) {
        	logger.error(e.getMessage());
        }

	}

	public static void main(String[] args) {
		SpringApplication.run(KpcTelegramBotsApplication.class, args);
	}
}
