package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Diamond {

  public static String print(int n) {
    return n > 0 && n % 2 != 0 ?
            IntStream.concat(
                            IntStream.range(1, n),
                            IntStream.range(0, n)
                                    .map(i -> n - i))
                    .filter(i -> i % 2 != 0)
                    .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i))
                    .collect(Collectors.joining("\n", "", "\n"))
            : null;
  }
}
