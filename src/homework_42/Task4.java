/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.
Если пользователь с заданным id существует в списке, вернуть Optional с пользователем,
иначе вернуть Optional.empty().
Подсказка:
Используйте Optional.of(user) или Optional.empty().
 */
package homework_42;

import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "User1"),
                new User(2, "User2"),
                new User(3, "User3"),
                new User(4, "User4"),
                new User(5, "User5"),
                new User(6, "User6")
        );

//        int id = 6;
        int id = 15;
        Optional<User> userOptional = findUserById(users, id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            System.out.println("Найден пользователь: " + user.getName());
        } else {
            Optional.empty();
            System.out.println("Пользователь с id " + id + " не найден");
        }
    }

    public static Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}