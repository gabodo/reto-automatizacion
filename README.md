# 🤖 OrangeHRM Automation Suite

**End-to-end automated testing suite for OrangeHRM — built with Java, Selenium WebDriver, Cucumber (BDD), and Maven.**

> Developed as a QA automation challenge. Demonstrates BDD test design, Page Object patterns, and real E2E scenarios.

---

## 🛠️ Tech Stack

| Tool | Purpose |
|---|---|
| Java 11+ | Core language |
| Selenium WebDriver | Browser automation |
| Cucumber + Gherkin | BDD framework |
| Maven | Dependency management |
| IntelliJ IDEA | IDE |

---

## ✅ Test Coverage

- **Login Module** — valid credentials, negative scenarios, session handling
- **Recruitment Module** — workflow validation (in progress)

```gherkin
Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters valid credentials
    Then the user should see the Dashboard
```

---

## 🚀 Getting Started

```bash
# Clone the repo
git clone https://github.com/gabodo/reto-automatizacion.git
cd reto-automatizacion

# Install dependencies
mvn clean install

# Run tests
mvn test
```

**Prerequisites:** Java 11+, Maven, ChromeDriver on PATH

---

## 📁 Project Structure

```
src/
├── main/java/com.orangehrm.reto/
└── test/
    ├── java/
    │   ├── features/        # Gherkin scenarios
    │   ├── steps/           # Step definitions
    │   └── tasks/           # Page actions
    └── resources/
```

---

## 🔭 Roadmap

- [ ] Expand recruitment module test coverage
- [ ] Add GitHub Actions CI/CD pipeline
- [ ] Implement Allure Reports
- [ ] Parallel test execution

---

## 👤 Author

**Gustavo Bohorquez** — QA Engineer  
[LinkedIn](https://www.linkedin.com/in/gabohorquez/) · [Portfolio](https://gabodo.github.io)
