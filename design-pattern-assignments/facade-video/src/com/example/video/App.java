package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
//        Decoder dec = new Decoder();
//        FilterEngine fe = new FilterEngine();
//        Encoder enc = new Encoder();
//
//        Frame[] frames = dec.decode(Path.of("in.mp4"));
//        frames = fe.grayscale(frames);
//        frames = fe.scale(frames, 0.5);
        // Legacy filter not used due to odd API
        // (frame[] -> String frameshandle -> legacey -> ret string ->convert it into Frames[] ->encoder ) it shld all happen as a facade
//        Path out = enc.encode(frames, Path.of("out.mp4"));
//        System.out.println("Wrote " + out);
        // TODO: Replace all above with VideoPipelineFacade.process(...)

        VideoPipelineFacade videoPipelineFacade = new VideoPipelineFacade();

        Path out  = videoPipelineFacade,process(Path.of("in.mp4") ,Path.of("out.mp4") , true , 0.5 , 3 );
        System.out.println(out);
    }
}
