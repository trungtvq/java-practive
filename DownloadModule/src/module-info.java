module DownloadModule {
    requires IProcessModule;
    provides running.IProcess with processing.Download;
    exports processing to IDumpDataModule;
}