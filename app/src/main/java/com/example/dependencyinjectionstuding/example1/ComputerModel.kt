package com.example.dependencyinjectionstuding.example1

import dagger.Module
import dagger.Provides


@Module
class ComputerModel {


    //если класс не помечен inject, то dagger заглянет сюда в поиске неотмеченного
    //обьекта
    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse

    ): Computer {
        return Computer(
            monitor, computerTower, keyboard, mouse
        )
    }

    @Provides
    fun provideMonitor() = Monitor()

    @Provides
    fun provideKeyBoard() = Keyboard()

    @Provides
    fun provideMouse() = Mouse()

    @Provides
    fun provideComputerTown(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) = ComputerTower(
        storage, memory, processor
    )

    @Provides
    fun provideMemory() = Memory()

    @Provides
    fun provideStorage() = Storage()

    @Provides
    fun provideProcessor() = Processor()

}