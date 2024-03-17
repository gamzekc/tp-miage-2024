package com.acme.todolist;

import com.acme.todolist.domain.TodoItem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testLate()
	{
		String LATE = "[LATE!] ";

		TodoItem itemNow = new TodoItem("1", Instant.parse("2024-03-17T14:25:00.00Z"), "contenu");
		TodoItem itemLate = new TodoItem("2", Instant.parse("2024-03-10T14:00:00.00Z"), "contenu");
		TodoItem itemFutur = new TodoItem("3", Instant.parse("2024-03-25T14:00:00.00Z"), "contenu");

		assertEquals(itemNow .getContent(), itemNow.finalContent()) ;
		assertEquals(LATE + itemLate.getContent(), itemLate.finalContent()) ;
		assertEquals(itemFutur .getContent(), itemFutur.finalContent()) ;


	}

}
