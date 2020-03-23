package com.jreis.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactApplication.class, args);
    }


/*    @Component
    public class DatabaseLoader implements CommandLineRunner {
        // teste
        private final GrupoSeqRepository grupoSeqRepository;

        public DatabaseLoader(GrupoSeqRepository repository) {
            this.grupoSeqRepository = repository;
        }

        @Override
        public void run(String... strings) throws Exception {
            this.grupoSeqRepository.save(new GrupoSeq("1", "N"));
        }
    }*/
}
