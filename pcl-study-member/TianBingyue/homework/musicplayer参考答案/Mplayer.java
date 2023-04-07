package musicplayer;

public class Mplayer {
    public void play() {
        try {
            System.out.println(""); //空一行
            File file = new File(filepath + filename); // 获取当前选中歌曲的路径,创建文件对象
            System.out.println(" 开始播放:" + filename);  //打印播放当前所选的歌曲

            labelfileName.setText("当前播放音乐:" + filename); //将当前播放文件名赋值给标签内容，显示出来
            //取得文件输入流
            audioInputStream = AudioSystem.getAudioInputStream(file);
            //从提供的输入流中获取音频输入流。 流必须指向有效的音频文件数据。 该方法的实现可能需要多个解析器来检查流以确定它们是否支持它。
            audioFormat = audioInputStream.getFormat();

        }
        DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat,
                AudioSystem.NOT_SPECIFIED);
        frameSize = audioInputStream.getFormat().getFrameSize();//获取每个帧对应的字节数
        WholeTime = audioInputStream.getFrameLength() / audioFormat.getFrameRate();  //获取歌曲总时长(帧数/帧速率=秒数)
        sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
        sourceDataLine.open(audioFormat); //打开输入流()
        sourceDataLine.start(); //打开管道

        //try 设置音量
        setVolumn(Volumn);

        //创建独立线程进行播放
        isStop = false;//mark

        if (playthread != null) {
            playthread.stop();
        }

        playthread = new PlayThread(); //将原本为空对象的playThread实例化一个进程对象
        playthread.start(); //并开启进程(在暂停时，就直接取消掉进程)
    } catch (Exception e) {
        e.printStackTrace();
    }

}
//https://blog.51cto.com/u_15818359/5738721

