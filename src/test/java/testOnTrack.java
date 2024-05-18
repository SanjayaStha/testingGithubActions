import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.OnTrack;

public class TestOnTrack {
    
    @Test
    public void testTrueAddProjectName(){
        OnTrack onTrack = new OnTrack();
        onTrack.createProject("newProject");
        Assertions.assertTrue(onTrack.findProject("newProject"));
    }

    @Test
    public void testFalseAddProjectName(){
        OnTrack onTrack = new OnTrack();
        onTrack.createProject("newProject");
        Assertions.assertTrue(onTrack.findProject("newProject0"));
    }

    @Test
    public void testFalseAddProjectName1(){
        OnTrack onTrack = new OnTrack();
        onTrack.createProject("newProject");
        Assertions.assertTrue(onTrack.findProject("newProject2"));
    }
}

