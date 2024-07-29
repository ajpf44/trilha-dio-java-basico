package edu.dio.mockito;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListTest 
{
	private List<Integer> ints;
	@Mock
	private List<String> strs;
	@Test
	void addItemToList() {
		Mockito.when(strs.get(0)).thenReturn("b");
		
		Assertions.assertEquals("b", strs.get(0));
	}
}
