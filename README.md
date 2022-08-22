
# Challenge Builders

### Tecnologias:

- Java 8
- Maven
- Appium
- JUnit 4
- Selenium
- Cucumber

### Ferramentas:

- Android Studio
- IntelliJ

### Montando ambiente {MacOS}:

- Instalar homebrew:<br/>
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

- Instalar node:<br/>
brew install node

- Instalar Appium<br/>

npm i appium
npm i wd

- Instalar Java 8<br/>
brew install --cask adoptopenjdk8

- Instalar Maven<br/>
brew install maven

### Para exeuctar o projeto:

1 - Após tudo instalado, abra o homebrew e inicie o servidor appium digite:<br/>
: appium

2 - Abra o AndroidStudio, e execute VirtualDeviceManager
2.1 - Crie um simulador de dispositivo Android clicando em "create device"
2.2 - Nomeie esse dispositivo de "Nexus_6_API_30"
2.3 - Execute seu emulador de Android criado
2.4 - Certifique que o dispositivo esteja sendo executado

3 - Você pode executar o projeto através da linha de comando CLI com o seguinte comando:<br/>
:  mvn test -Dcucumber.filter.tags="@challengeBuilders"

3.1 - Se preferir execute a classe 'RunCucumberTest'

### Reports:<br/>

O report será gerado no formato nativo do cucumber, que poderá ser visualizado local pelo arquivo:<br/>
: /target/cucumber/cucumber.html

Ou através do link gerado que irá ser impresso no seu terminal como no exemplo abaixo:<br/>

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/284ac11f-7a2a-478b-9234-b462e8e49337 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└─────────────────────────────────────────Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.824 sec
