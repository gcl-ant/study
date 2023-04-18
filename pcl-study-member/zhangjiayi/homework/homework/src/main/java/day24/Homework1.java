package day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class Homework1 {

        public static void main(String[] args) throws IOException {

            // 读取日志文件中的所有行
            Stream<String> lines = Files.lines(Paths.get("method_logs.log"));

            // 按照方法名分组，统计调用次数
            Map<String, Long> countByMethod = lines
                    .map(line -> line.split(","))
                    .collect(Collectors.groupingBy(
                            parts -> parts[0].trim(), Collectors.counting()));

            // 按照方法名分组，计算总耗时
            Map<String, Long> totalTimeByMethod = lines
                    .map(line -> line.split(","))
                    .collect(Collectors.groupingBy(
                            parts -> parts[0].trim(),
                            Collectors.summingLong(parts -> Long.parseLong(parts[1].trim().replaceAll("[^0-9]", "")))));

            // 找到调用次数最多的方法
            String mostCalledMethod = countByMethod.entrySet().stream()
                    .max(Comparator.comparingLong(Map.Entry::getValue))
                    .get()
                    .getKey();

            // 找到调用总耗时最长的方法
            String longestExecutionMethod = totalTimeByMethod.entrySet().stream()
                    .max(Comparator.comparingLong(Map.Entry::getValue))
                    .get()
                    .getKey();

            System.out.println("Most called method: " + mostCalledMethod);
            System.out.println("Longest execution method: " + longestExecutionMethod);

            lines.close();
        }
    }

