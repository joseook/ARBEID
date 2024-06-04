
```markdown

# Marketplace App - Indústria 4.0

Este é um projeto de aplicativo mobile desenvolvido em Kotlin, com foco em um marketplace para a Indústria 4.0. A aplicação permite que contratantes pesquisem, verifiquem e analisem habilidades e conhecimentos de trabalhadores cadastrados, além de filtrar por especialidades como Robótica, Automação, Inteligência Artificial, etc.

## Estrutura do Projeto

### Branches

O repositório é organizado em diferentes branches para facilitar o desenvolvimento colaborativo:

- **main**: Branch principal que contém o código de produção final. Os merges de `front-end` e `back-end` são realizados nesta branch após revisão e aprovação.
- **front-end**: Branch dedicada ao desenvolvimento do front-end usando Android Studio.
- **back-end**: Branch dedicada ao desenvolvimento do back-end usando IntelliJ IDEA.
- **feature/<nome-da-feature>**: Branches temporárias criadas a partir de `front-end` ou `back-end` para o desenvolvimento de novas funcionalidades.

### Estrutura de Diretórios

#### Front-end

plaintext
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/arbeid/   # Código fonte Kotlin do app
│   │   │   ├── ui/                         # Componentes da UI
│   │   │   ├── model/                      # Modelos de dados
│   │   │   ├── viewmodel/                  # Lógica de interface (ViewModel)
│   │   │   ├── repository/                 # Repositórios de dados
│   │   │   └── MainActivity.kt             # Arquivo principal de atividade
│   │   ├── res/
│   │   │   ├── layout/                     # Arquivos de layout XML
│   │   │   ├── values/                     # Strings, cores, dimensões, etc.
│   │   │   └── drawable/                   # Recursos gráficos
│   │   └── AndroidManifest.xml             # Manifesto do Android
│   └── test/
│       ├── java/com/example/arbeid/   # Testes unitários
│       └── resources/                      # Recursos de teste
├── build.gradle                            # Script de build do Gradle


#### Back-end

plaintext
backend/
├── src/
│   ├── main/
│   │   ├── kotlin/com/example/arbeid/ # Código fonte Kotlin do back-end
│   │   │   ├── controller/                 # Controladores REST
│   │   │   ├── service/                    # Serviços de negócios
│   │   │   ├── model/                      # Modelos de dados
│   │   │   ├── repository/                 # Repositórios de dados
│   │   │   └── config/                     # Configurações do Spring Boot
│   │   └── resources/                      # Recursos do Spring Boot
│   └── test/
│       ├── kotlin/com/example/arbeid/ # Testes unitários
│       └── resources/                      # Recursos de teste
├── build.gradle                            # Script de build do Gradle


## Como Contribuir

### Criando uma Nova Feature

1. **Clone o repositório e navegue para a branch correta**:
   sh
   git clone https://github.com/usuario/projeto-marketplace.git
   cd arbeid
   git checkout front-end  # Ou back-end, dependendo da sua equipe


2. **Crie uma nova branch para a feature**:
   sh
   git checkout -b feature/nome-da-feature


3. **Desenvolva a feature e faça commits frequentes**:
   sh
   git add .
   git commit -m "Descrição da feature implementada"


4. **Suba as alterações para o repositório remoto**:
   sh
   git push origin feature/nome-da-feature


5. **Crie um Pull Request (PR)**:
    - Navegue até o repositório no GitHub.
    - Crie um novo Pull Request da sua branch `feature/nome-da-feature` para `front-end` ou `back-end`.
    - Adicione uma descrição detalhada do que foi implementado e quaisquer notas adicionais.

### Fazendo Merge de Features

1. **Revise o Pull Request**:
    - O código deve ser revisado por pelo menos um outro desenvolvedor.
    - Verifique se todos os testes passam e se o código segue os padrões de codificação do projeto.

2. **Aprovação e Merge**:
    - Após a revisão e aprovação, faça o merge do Pull Request para a branch `front-end` ou `back-end`.

3. **Merge para a Branch Principal**:
    - Periodicamente, faça o merge das branches `front-end` e `back-end` na `main` após garantir que o código esteja estável.
      sh
      git checkout main
      git merge front-end
      git merge back-end
      git push origin main
   ```

## Boas Práticas

- *Commits Frequentes*: Faça commits pequenos e frequentes para facilitar a revisão.
- *Mensagens de Commit Descritivas*: Escreva mensagens de commit que descrevam claramente o que foi alterado.
- *Código Limpo*: Siga boas práticas de codificação, como SOLID e DRY.
- *Documentação*: Documente qualquer alteração significativa no código ou na arquitetura.
- *Testes*: Escreva testes para qualquer nova funcionalidade ou correção de bug.

## Contato

Para mais informações ou para relatar problemas, entre em contato com [joseok.business@gmail.com](joseook:joseok.business@.com).

## Nota 

Também temos a versão web da aplicação caso esteja interessado: [Arbeid versão WEB](https://github.com/joseook/ARBEID-WEB)

---

### Nota
- Aqui vai um repositorio do github sobre commits que vai ajudar nas construções de commits semanticos para melhor experiencia: [Padrão de commits](https://github.com/iuricode/padroes-de-commits).
