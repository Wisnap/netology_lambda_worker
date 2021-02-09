public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private final int taskErrorTrigger = 33;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != taskErrorTrigger) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Произошла ошибка!");
            }
        }
    };
};

