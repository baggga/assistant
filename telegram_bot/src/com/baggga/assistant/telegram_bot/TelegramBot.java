package com.baggga.assistant.telegram_bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
    }

    public String getBotUsername() {
        return "Assistant Bot";
    }

    public String getBotToken() {
        return "Token";
    }
}
