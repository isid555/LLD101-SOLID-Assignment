public class VideoPipelineFacade {
    private final Decoder decoder;
    private final FilterEngine filterEngine;
    private final Encoder encoder;
    private final LegacyAdapter legacyAdapter;


    public VideoPipelineFacade(){
        this.decoder = new Decoder();
        this.filterEngine = new FilterEngine();
        this.encoder = new Encoder();
        this.legacyAdapter = new LegacyAdapter(new LegacySharpen());
    }

    public Path process(Path src , Path out , boolean gray , double scale , int strength){
        Frames[] frames = decoder.decode(src);

        if(gray){
            frames = filterEngine.grayscale(frames);
        }
        if(scale != null){
            frames = filterEnginesacle(frames,scale);
        }

        if(strength != null){
            frames = legacyAdapter.sharpen(frames , strength);
        }
        return encoder.encode(frames , out);
    }
}