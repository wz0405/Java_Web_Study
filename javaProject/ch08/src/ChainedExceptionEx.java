class ChainedExceptionEx {
    public static void main(String args[]) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // main�� ��

    static void install() throws InstallException {
        try {
            startInstall();        // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
            copyFiles();        // ���ϵ��� �����Ѵ�. 
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();    // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
        } // try�� ��
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace()) {        // ����� ��ġ ������ ������...
            throw new SpaceException2("��ġ�� ������ �����մϴ�.");
        }

        if (!enoughMemory()) {        // ����� �޸𸮰� ������...
            throw new MemoryException2("�޸𸮰� �����մϴ�.");
//		throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
        }
    } // startInstall�޼����� ��

    static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´�. */ }

    static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/}

    static boolean enoughSpace() {
        // ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
        return false;
    }

    static boolean enoughMemory() {
        // ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
        return true;
    }
} // ExceptionTestŬ������ ��

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}
