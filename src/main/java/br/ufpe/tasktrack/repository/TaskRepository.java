package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
/*  
    vamos implementar a interface TaskRepository, que estende JpaRepository. Isso nos dá acesso a métodos CRUD básicos sem precisar escrever código adicional. O JpaRepository é parte do Spring Data JPA e facilita a interação com o banco de dados. Com essa configuração, podemos usar o TaskRepository para salvar, atualizar, excluir e buscar tarefas no banco de dados de forma simples e eficiente.
    
    serve para mapear a entidade para o banco de dados, permitindo que o Spring Data JPA gere as consultas SQL necessárias para realizar operações CRUD (Create, Read, Update, Delete) na tabela correspondente à entidade Task. Com essa interface, podemos facilmente interagir com o banco de dados sem precisar escrever código SQL manualmente, aproveitando os métodos pré-definidos do JpaRepository.
*/
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}