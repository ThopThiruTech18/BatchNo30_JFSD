package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.versionit.config.KafkaConfig;
import in.versionit.config.RedisConfig;
import in.versionit.config.SecurityConfig;

@SpringBootApplication
public class No01FirstSprintBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(No01FirstSprintBootProject1Application.class, args);
	}

	@Bean
	public RedisConfig getRedisConfigInstance() {

		System.out.println("RedisConfig :: getRedisConfigInstance()");

		RedisConfig config = new RedisConfig();

		// Redis customization

		return config;

	}

	@Bean
	public KafkaConfig getKafkaConfigInstance() {

		System.out.println("KafkaConfig :: getKafkaConfigInstance()");

		KafkaConfig config = new KafkaConfig();

		// Redis customization

		return config;

	}

	@Bean
	public SecurityConfig getSecurityConfigConfigInstance() {

		System.out.println("SecurityConfig :: getSecurityConfigConfigInstance()");

		SecurityConfig config = new SecurityConfig();

		// Redis customization

		return config;

	}

}
