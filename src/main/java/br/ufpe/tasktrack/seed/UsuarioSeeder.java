package br.ufpe.tasktrack.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.ufpe.tasktrack.domain.Instituicao;
import br.ufpe.tasktrack.domain.Usuario;

@Configuration
public class UsuarioSeeder {
    @Bean
    CommandLineRunner initDatabase(UsuarioRepository usuarioRepo, InstituicaoRepository instRepo) {
        return args -> {
            // Here you can add code to seed the database with initial data
            // For example, you can create and save some Usuario entities
            if(usuarioRepo.count() > 0) return;

            Usuario u1 = new Usuario(null, "Matheus", "matheus@email.com");
            usuarioRepo.save(u1);

            Instituicao i1 = new Instituicao(null, "UFPE");
            instRepo.save(i1);
        };
    }


}
