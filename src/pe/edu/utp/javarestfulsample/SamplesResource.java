package pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.SampleClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Path("/samples")
public class SamplesResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SampleClass> getSamples() {

        List<SampleClass> samples = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            samples.add(new SampleClass("John", "Doe"));
        return samples;
    }
}
