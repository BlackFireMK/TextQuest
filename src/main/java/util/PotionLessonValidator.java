package util;

import exceptions.PotionLessonException;

public class PotionLessonValidator {

    public static void validateAnswer(String answer) {
        if (!answer.equalsIgnoreCase("prepare") && !answer.equalsIgnoreCase("socialize")) {
            throw new PotionLessonException("Некорректный ответ на вопрос урока зельеварения.");
        }
    }
}