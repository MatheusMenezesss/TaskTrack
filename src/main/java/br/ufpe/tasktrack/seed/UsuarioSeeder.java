package br.ufpe.tasktrack.seed;

import java.util.Vector;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.ufpe.tasktrack.domain.Instituicao;
import br.ufpe.tasktrack.domain.Usuario;
import br.ufpe.tasktrack.repository.InstituicaoRepository;
import br.ufpe.tasktrack.repository.UsuarioRepository;

@Configuration
public class UsuarioSeeder {
    @Bean
    CommandLineRunner initDatabase(UsuarioRepository usuarioRepo, InstituicaoRepository instRepo) {
        return args -> {
            // Here you can add code to seed the database with initial data
            // For example, you can create and save some Usuario entities
            //if(usuarioRepo.count() > 0) return;

            Vector<Usuario> usuarios = new Vector<>();
            //usuarios.add(new Usuario("Matheus", "12345678910", "matheus@email.com", "Rua dos Bobos, 0", "matheus123", "99999-9999", "admin"));
            usuarios.add(new Usuario("Ana", "98765432100", "ana@email.com", "Av. Boa Viagem, 100", "ana123", "98888-1111", "user"));
            usuarios.add(new Usuario("Carlos", "11122233344", "carlos@email.com", "Rua da Aurora, 55", "carlos123", "97777-2222", "user"));
            usuarios.add(new Usuario("Beatriz", "22233344455", "bia@email.com", "Rua do Sol, 12", "bia123", "96666-3333", "user"));
            usuarios.add(new Usuario("Joao", "33344455566", "joao@email.com", "Av. Recife, 200", "joao123", "95555-4444", "manager"));
            usuarios.add(new Usuario("Mariana", "44455566677", "mariana@email.com", "Rua das Flores, 88", "mari123", "94444-5555", "user"));
            usuarios.add(new Usuario("Pedro", "55566677788", "pedro@email.com", "Rua do Futuro, 5", "pedro123", "93333-6666", "user"));
            usuarios.add(new Usuario("Larissa", "66677788899", "larissa@email.com", "Rua da Paz, 77", "lari123", "92222-7777", "user"));

            usuarioRepo.saveAll(usuarios);

            Vector<Instituicao> instituicoes = new Vector<>();


            instituicoes.add(new Instituicao("Universidade Federal de Pernambuco", "UFPE"));
            instituicoes.add( new Instituicao("Universidade de Pernambuco", "UPE"));
            instituicoes.add( new Instituicao("Instituto Federal de Pernambuco", "IFPE"));
            instituicoes.add(new Instituicao("Universidade Federal Rural de Pernambuco", "UFRPE"));

            instRepo.saveAll(instituicoes);
        };
    }


}
