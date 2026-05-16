# FilmManagement - Advanced Movie & Cinema Management System 🎬

FilmManagement is a robust desktop application developed in Java using NetBeans. The project serves as an advanced platform for cataloging movies, managing actor profiles, tracking revenue, and handling viewer feedback. It incorporates specialized data structures and algorithmic designs to optimize search, ranking, and recommendation features.

---

## 🚀 Key Features

* **Advanced Search Architecture:** Utilizes a custom search tree mechanism (`FilmSearchTree`) to look up movies efficiently.
* **Algorithmic Analytics:** Incorporates analytical engines like `PopularityRanking` and `RevenueManager` to track box-office performance and trend analysis.
* **Smart Content Discovery:** Features an automated system (`Recommendations`) to provide content suggestions based on metrics.
* **Feedback Loop:** Built-in viewer interaction handling via specialized forms and control frameworks (`ViewerFeedback`).

---

## 📐 Architecture & Core Concepts

This project highlights intermediate and advanced software engineering concepts by organizing code into modular, entity-driven structures:

* **Entity-Relationship Model:** Clean abstraction of real-world objects into objects like `Film` and `Actor`, mapping correlations cleanly.
* **Data Structures Implementation:** Leverages custom trees and list structures to handle fast queries rather than relying entirely on simple arrays.
* **Analytical Modules:** Decoupled business logic where metrics, financials, and trends are isolated from the primary UI elements.

### System Flow & Structural Layout

```text
      +-------------------------------------------------+
      |            FilmManagementSystem (UI)            |
      +-------------------------------------------------+
          |                 |                  |
          v                 v                  v
  +---------------+ +---------------+ +------------------+
  |FilmSearchTree | |Recommendations| | PopularityRanking|
  +---------------+ +---------------+ +------------------+
          |
          v
  +---------------+
  |  Film / Actor |
  +---------------+


##💻 Tech Stack & Tools
. Language: Java (JDK 8 or higher)

. GUI Framework: Java Swing / AWT

. IDE: NetBeans IDE

##⚙️ Installation & Running the App
1. Clone this repository to your local machine:
 git clone [https://github.com/MehmetMertYigit/FilmManagement.git](https://github.com/MehmetMertYigit/FilmManagement.git)

2. Open the project folder inside NetBeans IDE.

3. Clean and build the project to settle dependencies.

4. Run FilmManagementSystem.java as the main entry point to start the application.
