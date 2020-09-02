package zy.day14.two.Checkpoint2.test1;

public class Son extends Father {

//    @Override
//    public void eat() throws TonguePainException {
//        throw new TonguePainException("舌头疼");
//    }

//    @Override
//    public void eat() throws PainExecption {
//        throw new PainExecption("疼");
//    }

//    @Override
//    public void eat() throws ToothPainException {
//        throw new ToothPainException("牙疼");
//    }


//    @Override
//    public void eat() throws BigToothPainException {
//        throw new BigToothPainException("大牙疼");
//    }


//    @Override
//    public void eat() throws BigToothPainException,FrontToothPainExcption {
//        throw new FrontToothPainExcption("门牙疼");
//    }

//    @Override
//    public void drink() throws BigToothPainException{
//        throw new BigToothPainException("门牙疼");
//    }


    @Override
    public void drink() {
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
