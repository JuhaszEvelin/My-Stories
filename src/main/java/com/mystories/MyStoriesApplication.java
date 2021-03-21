package com.mystories;

//import com.mystories.config.EmbeddedServletContainerAutoConfiguration;
//import com.mystories.config.ServerPropertiesAutoConfiguration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mystories.persistence.model.Story;
import com.mystories.persistence.repo.StoryRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
//@EnableJpaRepositories("com.baeldung.persistence.repo")
@EntityScan
@SpringBootApplication
public class MyStoriesApplication implements CommandLineRunner{

    @Autowired
    private StoryRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MyStoriesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of stories
        repository.save(new Story("Alice in wonderland", "Lorem ispum lorem ipsum"));
        repository.save(new Story("Süsü a sárkány", "Hol volt, hol nem volt"));

        // fetch all customers
        System.out.println("Stories found with findAll():");
        System.out.println("-------------------------------");
        for (Story story : repository.findAll()) {
            System.out.println(story);
        }
        System.out.println();

        // fetch an individual story
        System.out.println("Story found with findByTitle('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByTitle("Alice"));

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }


}
