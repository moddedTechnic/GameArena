# Usage

```sh
mkdir myproject
cd myproject
git init
git submodule add git@github.com:moddedTechnic/GameArenaAdvanced.git game_arena
vim Main.java
```

You can add the following to `Main.java`:

```java
import game_arena.*;

class Main {
    public static void main(String[] args) {
        GameArena arena = new GameArena(500, 300);
        Ball b = new Ball(250, 150, 20, "GREEN");
        arena.addBall(b);

        while (true) {
            arena.pause();
        }
    }
}
```

