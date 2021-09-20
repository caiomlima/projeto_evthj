Este projeto foi feito com o intuito de aprendizado, sem qualquer forma de monetização ou divulgação

Tecnologias usadas:

- Java (V 11)
- HTML, CSS e JS
- Spring Boot e Spring Security
- Thymeleaf (Substituindo o JSP)
- JPA (Hibernate)
- MySQL

No momento, o site contém:

- CRUD dos eventos
  

- Criação de usuário com role "USER" (com relação ManyToMany no MySQL para gerar as roles)
  

- Login (autenticação) dos usuários para controle de acesso a certos conteúdos (Controle de autoridade)
  

- Relação do evento ao email do User que criou o evento, tornando update e delete apenas a quem criou o evento (precisa estar logado)


- Validação nos forms de criação de eventos e usuários