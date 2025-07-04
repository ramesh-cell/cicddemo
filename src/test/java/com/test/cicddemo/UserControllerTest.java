package com.test.cicddemo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    void testGetUserById() {
        // Given
        Long userId = 1L;
        User mockUser = new User(userId, "John Doe");

        when(userService.getUserById(userId)).thenReturn(mockUser);

        // When
        User result = userController.getUser(userId);

        // Then
        assertNotNull(result);
        assertEquals(userId, result.getId());
        assertEquals("John Doe", result.getName());

        verify(userService, times(1)).getUserById(userId);
    }
}
