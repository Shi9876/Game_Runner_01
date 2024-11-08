# Game_Runner_01
Just created Mario Project by learning loose Coupling with Spring Framework. In this, we design Game Runner to run games: Mario, Super contra, PacMan etc. 

What I have learned:
* Built a strong foundation in the Spring framework
* Gained understanding of key concepts like Dependency Injection
* Learned about the Inversion of Control (IOC) Container
* Explored the role and functionality of Application Context
* Understood how Component Scanning works to detect Spring-managed beans
* Practiced usage and management of Spring Beans
* Implemented Auto Wiring for dependency resolution
* Examined the trade-off in Spring: While it may replace simple lines with more complex configurations, it adds significant value by improving scalability, maintainability, 
  and flexibility.


PROCESS:

Heration 1- Tightly Coupled

→ GameRunner: class

→ Game classes: Marie, Contre, PacMan etc

* Explanation - Tight coupling occurs when a class is dependemt on a specific implementation of another class, making it hard to modify or extend without altering the original code.

Here, GameRunner is tightly coupled to MarioGame because it explicitly requires a MarioGame object. If you want to run a different game, like SuperContraGame, you would need to modify this code to replace MarioGame with SuperContraGame.

• Iteration 2: Loose Coupling Sampling - Interfaces.

→ GameRunner: class

→ Gaming Console interface

→ Game classes: Mario, Super Contre, PacMan etc.

* Explanation -  Loose coupling is a design principle in which classes or components are minimally dependent on each other. In a loosely coupled system, classes interact through abstractions (like interfaces), not specific implementations. This makes the system more flexible, allowing components to be easily replaced, modified, or extended without impacting other parts of the code.
 
Here, In our code, by introducing the GameConsole interface, we can create a loosely coupled relationship between GameRunner and the games (MarioGame and SuperContraGame). Now GameRunner depends on GameConsole, not on specific games. This allows us to switch between MarioGame and SuperContraGame without changing GameRunner.

• Iteration 3: Loose Coupling - Spring

Spring framework will manage all our objects.

→ GameRunner: class

→ Gaming Console interface

→ Game classes: Mario, Super Contre, PacMan etc.


