package jurl.bot.exception;

public class BotException extends RuntimeException {

    public BotException(String message, Object... args) {
        super(String.format(message, args));
    }
}
