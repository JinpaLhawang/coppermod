package com.jinpalhawang.jambudvipa.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.jinpalhawang.jambudvipa.block.ModBlocks;

public class ModWorldGeneration implements IWorldGenerator {

  private static int OVERWORLD_DIMENSION = 0;
  private static int COPPER_MIN_Y = 16;
  private static int COPPER_MAX_Y = 64;
  private static int COPPER_ORE_CHANCES = 60; // 6

  @Override
  public void generate(
      Random random,
      int chunkX,
      int chunkZ,
      World world,
      IChunkGenerator chunkGenerator,
      IChunkProvider chunkProvider) {

    if (world.provider.getDimension() == OVERWORLD_DIMENSION) {
      generateOverworld(random, chunkX, chunkZ, world, chunkGenerator,
          chunkProvider);
    }
  }

  private void generateOverworld(
      Random random,
      int chunkX,
      int chunkZ,
      World world,
      IChunkGenerator chunkGenerator,
      IChunkProvider chunkProvider) {

    generateOre(ModBlocks.oreCopper.getDefaultState(), world, random,
        chunkX * 16, chunkZ * 16, COPPER_MIN_Y, COPPER_MAX_Y, 4 + random.nextInt(4), COPPER_ORE_CHANCES);
  }

  private void generateOre(
      IBlockState ore,
      World world,
      Random random,
      int x,
      int z,
      int minY,
      int maxY,
      int size,
      int chances) {

    int deltaY = maxY - minY;

    for (int i = 0; i < chances; i++) {
      BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

      WorldGenMinable generator = new WorldGenMinable(ore, size);
      generator.generate(world, random, pos);
    }
  }

}
