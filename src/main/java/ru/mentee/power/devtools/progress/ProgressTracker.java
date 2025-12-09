package ru.mentee.power.devtools.progress;


public class ProgressTracker {

    /**
     * Вычисляет суммарный прогресс группы mentee.
     *
     * @param mentees массив mentee
     * @return строка с информацией о суммарном прогрессе (пройдено/осталось уроков)
     */
    public String calculateTotalProgress(Mentee[] mentees) {
        // Проверка валидности массива
        if (mentees == null || mentees.length == 0) {
            return "Суммарно: пройдено 0 из 0 уроков, осталось 0 уроков";
        }

        // Инициализация аккумуляторов
        int totalCompleted = 0;
        int totalTotal = 0;
        int index = 0;

        // Цикл while для перебора массива
        while (index < mentees.length) {
            totalCompleted += mentees[index].completedLessons();
            totalTotal += mentees[index].totalLessons();
            index++;
        }

        // Вычисление оставшихся уроков
        int totalRemaining = totalTotal - totalCompleted;

        // Возвращение строки с информацией о суммарном прогрессе
        return String.format("Суммарно: пройдено %d из %d уроков, осталось %d уроков", totalCompleted, totalTotal, totalRemaining);
    }

    public static void main(String[] args) {
        ProgressTracker tracker = new ProgressTracker();

        // Создаём массив mentee
        Mentee[] mentees = {
                new Mentee("Иван", "Москва", "Backend разработка", 5, 12),
                new Mentee("Мария", "Санкт-Петербург", "Fullstack", 8, 12),
                new Mentee("Пётр", "Казань", "Java Backend", 12, 12)
        };

        String progress = tracker.calculateTotalProgress(mentees);
        System.out.println(progress);
    }
}
