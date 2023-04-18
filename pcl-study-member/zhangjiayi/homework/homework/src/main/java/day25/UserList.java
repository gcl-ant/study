package day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

    public class UserList {
        private static final String FILE_PATH = "user_list.txt";

        public static void main(String[] args) {
            List<User> userList = readUserList(FILE_PATH);
            sortUserListByAge(userList);
            for (User user : userList) {
                System.out.println(user);
            }
        }

        private static List<User> readUserList(String filePath) {
            List<User> userList = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File(filePath))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        int age = Integer.parseInt(parts[1].trim());
                        User user = new User(name, age);
                        userList.add(user);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return userList;
        }

        private static void sortUserListByAge(List<User> userList) {
            Collections.sort(userList, Comparator.comparingInt(User::getAge));
        }

        private static class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return String.format("User{name='%s', age=%d}", name, age);
            }
        }
    }

