package day21;

import java.util.function.Supplier;

interface Storage {
    byte[] read(String fileName);
}

class InternalStorage implements Storage {
    public byte[] read(String fileName) {
        // implementation
        return new byte[0];
    }
}

class TFCardReader implements Storage {
    public byte[] read(String fileName) {
        // implementation
        return new byte[0];
    }
}

interface Processor {
    byte[] process(byte[] data);
}

class SpecialProcessor implements Processor {
    public byte[] process(byte[] data) {
        // implementation
        return data;
    }
}

class GeneralProcessor implements Processor {
    public byte[] process(byte[] data) {
        // implementation
        return data;
    }
}

interface Decoder {
    void decode(byte[] data);
}

class SoftwareDecoder implements Decoder {
    public void decode(byte[] data) {
        // implementation
    }
}

class HardwareDecoder implements Decoder {
    public void decode(byte[] data) {
        // implementation
    }
}

interface OS {
    void bootloader();
    void play(String fileName);
}

class NonSmartOS implements OS {
    public void bootloader() {
        // implementation
    }

    public void play(String fileName) {
        // implementation
    }
}

class SmartOS implements OS {
    private Supplier<Processor> processorFactory;
    private Supplier<Decoder> decoderFactory;

    public SmartOS(Supplier<Processor> processorFactory, Supplier<Decoder> decoderFactory) {
        this.processorFactory = processorFactory;
        this.decoderFactory = decoderFactory;
    }

    public void bootloader() {
        // implementation
    }

    public void play(String fileName) {
        Storage storage = new InternalStorage(); // or TFCardReader
        byte[] data = storage.read(fileName);
        Processor processor = processorFactory.get();
        byte[] processedData = processor.process(data);
        Decoder decoder = decoderFactory.get();
        decoder.decode(processedData);
    }
}

abstract class MusicPlayer {
    protected OS os;

    public MusicPlayer(OS os) {
        this.os = os;
    }

    public void play(String fileName) {
        os.play(fileName);
    }
}

class SpecialMusicPlayer extends MusicPlayer {
    private Processor processor;

    public SpecialMusicPlayer(OS os) {
        super(os);
        this.processor = new SpecialProcessor();
    }

    public byte[] process(byte[] data) {
        return processor.process(data);
    }
}

class GeneralMusicPlayer extends MusicPlayer {
    private Processor processor;

    public GeneralMusicPlayer(OS os) {
        super(os);
        this.processor = new GeneralProcessor();
    }

    public byte[] process(byte[] data) {
        return processor.process(data);
    }
}
