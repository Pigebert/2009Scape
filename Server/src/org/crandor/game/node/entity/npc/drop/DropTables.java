package org.crandor.game.node.entity.npc.drop;

import org.crandor.game.content.ItemNames;
import org.crandor.game.node.item.ChanceItem;
import org.crandor.game.node.item.Item;
import org.crandor.game.node.item.WeightedChanceItem;
import org.crandor.tools.RandomFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public enum DropTables {
    //FORMAT NPC(int[] ids, int.... shared table weights, new Item[] always drops, new ChanceItem[] charms, new WeightedChanceItem[] main drop table)
    MAN_AND_THIEF(new int[]{1,2,3,4,5,6,8}, 0, 0, 0, 0, 0, 0, 23, 0,
            new Item[]{new Item(ItemNames.BONES_2530)}, //always drops
            new ChanceItem[]{}, // charms
            new WeightedChanceItem[]{ //main drop table v
                    new WeightedChanceItem(ItemNames.BRONZE_MED_HELM,1,2),
                    new WeightedChanceItem(ItemNames.IRON_DAGGER,1,1),
                    new WeightedChanceItem(ItemNames.BRONZE_BOLTS,2,12,22),
                    new WeightedChanceItem(ItemNames.BRONZE_ARROW,7,3),
                    new WeightedChanceItem(ItemNames.EARTH_RUNE,4,2),
                    new WeightedChanceItem(ItemNames.FIRE_RUNE,6,2),
                    new WeightedChanceItem(ItemNames.MIND_RUNE,9,2),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,2,1),
                    new WeightedChanceItem(ItemNames.COINS,3,38),
                    new WeightedChanceItem(ItemNames.COINS,5,9),
                    new WeightedChanceItem(ItemNames.COINS,15,4),
                    new WeightedChanceItem(ItemNames.COINS,25,1),
                    new WeightedChanceItem(ItemNames.FISHING_BAIT,1,5),
                    new WeightedChanceItem(ItemNames.COPPER_ORE,1,2),
                    new WeightedChanceItem(ItemNames.EARTH_TALISMAN,1,2),
                    new WeightedChanceItem(ItemNames.CABBAGE,1,1)
            }),
    FARMER(new int[]{7},0,0,0,0,27,0,11,0,
            new Item[]{new Item(ItemNames.BONES_2530)},
            new ChanceItem[]{},
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.EARTH_RUNE,4,2),
                    new WeightedChanceItem(ItemNames.FIRE_RUNE,6,2),
                    new WeightedChanceItem(ItemNames.MIND_RUNE,9,2),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,2,1),
                    new WeightedChanceItem(ItemNames.COINS,3,38),
                    new WeightedChanceItem(ItemNames.COINS,25,1),
                    new WeightedChanceItem(ItemNames.FISHING_BAIT,1,5),
                    new WeightedChanceItem(ItemNames.RAKE_5341,1,3),
                    new WeightedChanceItem(ItemNames.EARTH_TALISMAN,1,2),
                    new WeightedChanceItem(ItemNames.GARDENING_BOOTS_5345,1,2),
                    new WeightedChanceItem(ItemNames.SEED_DIBBER_5343,1,2),
                    new WeightedChanceItem(ItemNames.SECATEURS_5329,1,1),
                    new WeightedChanceItem(ItemNames.WATERING_CAN8_5340,1,1)
            }),
    GUARD(new int[]{9,32,206,296,297,298,299,344,345,346,368},0,18,0,0,0,0,0,0,
            new Item[]{new Item(ItemNames.BONES_2530)},
            new ChanceItem[]{},
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.IRON_BOLTS_9140,2,12,10),
                    new WeightedChanceItem(ItemNames.STEEL_ARROW,1,4),
                    new WeightedChanceItem(ItemNames.BRONZE_ARROW,1,3),
                    new WeightedChanceItem(ItemNames.AIR_RUNE,6,2),
                    new WeightedChanceItem(ItemNames.EARTH_RUNE,3,2),
                    new WeightedChanceItem(ItemNames.FIRE_RUNE,2,2),
                    new WeightedChanceItem(ItemNames.BLOOD_RUNE,1,1),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,1,1),
                    new WeightedChanceItem(ItemNames.NATURE_RUNE,1,1),
                    new WeightedChanceItem(ItemNames.STEEL_ARROW,5,1),
                    new WeightedChanceItem(ItemNames.COINS,1,19),
                    new WeightedChanceItem(ItemNames.COINS,7,16),
                    new WeightedChanceItem(ItemNames.COINS,12,9),
                    new WeightedChanceItem(ItemNames.COINS,4,8),
                    new WeightedChanceItem(ItemNames.COINS,25,4),
                    new WeightedChanceItem(ItemNames.COINS,17,4),
                    new WeightedChanceItem(ItemNames.COINS,30,2),
                    new WeightedChanceItem(ItemNames.IRON_DAGGER,1,6),
                    new WeightedChanceItem(ItemNames.BODY_TALISMAN,1, 3),
                    new WeightedChanceItem(ItemNames.GRAIN_1947,1,1),
                    new WeightedChanceItem(ItemNames.IRON_ORE,1,1)
            }),
    BARBARIAN(new int[] {12,3246,3247,3248,3249,3250,3251,3252,3253,3255,3256,3257,3258,3259,3260,3261,3262,3263,3264},0,0,0,0,0,0,0,0,
            new Item[]{new Item(ItemNames.BONES_2530)},
            new ChanceItem[]{},
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.IRON_AXE,1,6),
                    new WeightedChanceItem(ItemNames.BRONZE_BATTLEAXE,1,4),
                    new WeightedChanceItem(ItemNames.IRON_MACE,1,1),
                    new WeightedChanceItem(ItemNames.BRONZE_ARROW,10,4),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,3,4),
                    new WeightedChanceItem(ItemNames.IRON_ARROW,8,3),
                    new WeightedChanceItem(ItemNames.EARTH_RUNE,5,3),
                    new WeightedChanceItem(ItemNames.MIND_RUNE,10,2),
                    new WeightedChanceItem(ItemNames.FIRE_RUNE,8,2),
                    new WeightedChanceItem(ItemNames.LAW_RUNE,2,1),
                    new WeightedChanceItem(ItemNames.COINS,8,42),
                    new WeightedChanceItem(ItemNames.COINS,12,9),
                    new WeightedChanceItem(ItemNames.COINS,25,5),
                    new WeightedChanceItem(ItemNames.COINS,32,3),
                    new WeightedChanceItem(ItemNames.COOKED_MEAT,1,1),
                    new WeightedChanceItem(ItemNames.AMULET_MOULD_1595,1,1),
                    new WeightedChanceItem(ItemNames.BEER,1,1),
                    new WeightedChanceItem(ItemNames.BEAR_FUR_948,1,1),
                    new WeightedChanceItem(ItemNames.FLIER_956,1,1),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,1)
            }),
    ABERRANT_SPECTRE(new int[] {1604,1605,1606,1607}, 0,0,76,0,0,0,312,0,
            new Item[]{},
            new ChanceItem[]{
                    new ChanceItem(12158,1,DropFrequency.COMMON),
                    new ChanceItem(12159,1,DropFrequency.COMMON),
                    new ChanceItem(12160,1,DropFrequency.UNCOMMON),
                    new ChanceItem(12163,1,DropFrequency.RARE)
            },
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.STEEL_AXE,1,12),
                    new WeightedChanceItem(ItemNames.MITHRIL_KITESHIELD,1,4),
                    new WeightedChanceItem(ItemNames.LAVA_BATTLESTAFF,1,4),
                    new WeightedChanceItem(ItemNames.ADAMANT_PLATELEGS,1,4),
                    new WeightedChanceItem(ItemNames.RUNE_FULL_HELM,1,4),
                    new WeightedChanceItem(ItemNames.MYSTIC_ROBE_BOTTOM_DARK,1,1),
                    new WeightedChanceItem(ItemNames.COINS,460,4),
                    new WeightedChanceItem(0,1,55),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,20)
            }),
    ABYSSAL_DEMONS(new int[] {1615}, 0,0,0,0,0,0,76,0,
            new Item[]{new Item(ItemNames.ASHES)},
            new ChanceItem[]{
                    new ChanceItem(12158,1,DropFrequency.COMMON),
                    new ChanceItem(12159,1,DropFrequency.COMMON),
                    new ChanceItem(12160,1,DropFrequency.UNCOMMON),
                    new ChanceItem(12163,1,DropFrequency.RARE)
            },
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.BLACK_SWORD,1,16),
                    new WeightedChanceItem(ItemNames.STEEL_BATTLEAXE,1,12),
                    new WeightedChanceItem(ItemNames.BLACK_AXE,1,8),
                    new WeightedChanceItem(ItemNames.MITHRIL_KITESHIELD,1,4),
                    new WeightedChanceItem(ItemNames.RUNE_CHAINBODY,1,4),
                    new WeightedChanceItem(ItemNames.RUNE_MED_HELM,1,4),
                    new WeightedChanceItem(ItemNames.ABYSSAL_WHIP,1,1),
                    new WeightedChanceItem(ItemNames.AIR_RUNE,50,32),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,10,24),
                    new WeightedChanceItem(ItemNames.BLOOD_RUNE,7,16),
                    new WeightedChanceItem(ItemNames.LAW_RUNE,3,4),
                    new WeightedChanceItem(ItemNames.PURE_ESSENCE_NOTED,60,20),
                    new WeightedChanceItem(ItemNames.ADAMANT_BAR,1,8),
                    new WeightedChanceItem(ItemNames.COINS,132,140),
                    new WeightedChanceItem(ItemNames.COINS,220,36),
                    new WeightedChanceItem(ItemNames.COINS,30,28),
                    new WeightedChanceItem(ItemNames.COINS,44,24),
                    new WeightedChanceItem(ItemNames.COINS,460,4),
                    new WeightedChanceItem(ItemNames.LOBSTER,1,8),
                    new WeightedChanceItem(ItemNames.COSMIC_TALISMAN,1,4),
                    new WeightedChanceItem(ItemNames.CHAOS_TALISMAN,1,4),
                    new WeightedChanceItem(ItemNames.DEFENCE_POTION3,1,4),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,8)
            }),
    ANKOU(new int[] {4381, 4382, 4383}, 1,0,0,0,0,0,3,0,
            new Item[]{new Item(ItemNames.BONES_2530)},
            new ChanceItem[]{},
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.BLACK_KNIFE_869,1,1),
                    new WeightedChanceItem(ItemNames.BLACK_ROBE,1,1),
                    new WeightedChanceItem(ItemNames.DEATH_RUNE,10,10),
                    new WeightedChanceItem(ItemNames.BLOOD_RUNE,11,6),
                    new WeightedChanceItem(ItemNames.LAW_RUNE,2,6),
                    new WeightedChanceItem(ItemNames.ADAMANT_ARROW,5,14,4),
                    new WeightedChanceItem(ItemNames.BLOOD_RUNE,5,3),
                    new WeightedChanceItem(ItemNames.PURE_ESSENCE_NOTED,15,5),
                    new WeightedChanceItem(ItemNames.MITHRIL_ORE_NOTED,3,7,2),
                    new WeightedChanceItem(ItemNames.COINS,8,33),
                    new WeightedChanceItem(ItemNames.COINS,5,204,10),
                    new WeightedChanceItem(ItemNames.FISHING_BAIT,60,30),
                    new WeightedChanceItem(ItemNames.LEFT_SKULL_HALF_9008,1,3),
                    new WeightedChanceItem(ItemNames.BASS,1,2),
                    new WeightedChanceItem(ItemNames.WEAPON_POISON,1,2),
                    new WeightedChanceItem(ItemNames.FRIED_MUSHROOMS_7082,1,1),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,2)
            }),
    AVIANSIE(IntStream.range(6232,6247).toArray(),0,0,0,0,0,0,15,0,
            new Item[]{new Item(ItemNames.BONES_2530),new Item(ItemNames.FEATHER,6)},
            new ChanceItem[]{},
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.RUNE_DAGGERP__5678,1,11),
                    new WeightedChanceItem(ItemNames.AIR_RUNE,15,18),
                    new WeightedChanceItem(ItemNames.WATER_RUNE,30,13),
                    new WeightedChanceItem(ItemNames.LAW_RUNE,2,4),
                    new WeightedChanceItem(ItemNames.NATURE_RUNE,9,4),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,3,3),
                    new WeightedChanceItem(ItemNames.BODY_RUNE,12,2),
                    new WeightedChanceItem(ItemNames.BLOOD_RUNE,11,2),
                    new WeightedChanceItem(ItemNames.MIND_RUNE,5,1),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE, 16, 1),
                    new WeightedChanceItem(ItemNames.ADAMANT_BAR,4,30),
                    new WeightedChanceItem(ItemNames.SILVER_ORE_442,1,10),
                    new WeightedChanceItem(ItemNames.RUNITE_LIMBS,1,1),
                    new WeightedChanceItem(ItemNames.ANTIPOISON3_175,5,5),
                    new WeightedChanceItem(ItemNames.SWORDFISH,5,2),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,3)
            }),
    BANSHEE(new int[] {1612},0,0,0,0,0,0,136,0,
            new Item[]{},
            new ChanceItem[]{
                    new ChanceItem(12158,1,DropFrequency.COMMON),
                    new ChanceItem(12159,1,DropFrequency.COMMON),
                    new ChanceItem(12160,1,DropFrequency.UNCOMMON),
                    new ChanceItem(12163,1,DropFrequency.RARE)
            },
            new WeightedChanceItem[]{
                    new WeightedChanceItem(ItemNames.IRON_MACE,1,8),
                    new WeightedChanceItem(ItemNames.IRON_DAGGER,1,8),
                    new WeightedChanceItem(ItemNames.IRON_KITESHIELD,1,4),
                    new WeightedChanceItem(ItemNames.MYSTIC_GLOVES_DARK,1,1),
                    new WeightedChanceItem(ItemNames.AIR_RUNE,3,12),
                    new WeightedChanceItem(ItemNames.COSMIC_RUNE,2,12),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,3,8),
                    new WeightedChanceItem(ItemNames.FIRE_RUNE,7,4),
                    new WeightedChanceItem(ItemNames.CHAOS_RUNE,7,4),
                    new WeightedChanceItem(ItemNames.PURE_ESSENCE_NOTED,13,88),
                    new WeightedChanceItem(ItemNames.IRON_ORE,1,4),
                    new WeightedChanceItem(ItemNames.COINS,13,40),
                    new WeightedChanceItem(ItemNames.COINS,26,32),
                    new WeightedChanceItem(ItemNames.COINS,35,32),
                    new WeightedChanceItem(ItemNames.FISHING_BAIT,15,88),
                    new WeightedChanceItem(ItemNames.FISHING_BAIT,7,20),
                    new WeightedChanceItem(ItemNames.EYE_OF_NEWT,1,4),
                    new WeightedChanceItem(RareDropTable.SLOT_ITEM_ID,1,8)
            });


    //map our npc ids to their drop table
    public static HashMap<Integer,DropTables> dropTableMap = new HashMap<>();
    static{
        for(DropTables table : DropTables.values()){
            for(int npc_id : table.ids){
                dropTableMap.putIfAbsent(npc_id,table);
            }
        }
    }

    public int[] ids;
    public WeightedChanceItem[] table;
    public Item[] always;
    public ChanceItem[] charms;
    int[] sharedTableWeights;
    DropTables(int[] ids, int commonSeed, int fixedAllot, int rareSeed, int treeHerb, int varAllot, int hops, int herbs, int usefulHerbs, Item[] always, ChanceItem[] charms, WeightedChanceItem[] table){
        this.ids = ids;
        this.table = table;
        this.sharedTableWeights = new int[] {commonSeed,fixedAllot,rareSeed,treeHerb,varAllot,hops,herbs,usefulHerbs};
        this.always = always;
        this.charms = charms;
    }

    public static DropTables forId(int id){
        return dropTableMap.get(id);
    }

    public List<Item> getDrops(){
        //roll all of our shared drop tables that this npc can roll on.
        List<WeightedChanceItem> sharedTablesRolls = new ArrayList<>();
        for(int i = 0; i < sharedTableWeights.length; i++){
            if(sharedTableWeights[i] == 0){
                continue;
            }
            //roll on the table and add a WeightedChanceItem with the table's weight to the list
            Item temp = RandomFunction.rollWeightedChanceTable(SharedTables.values()[i].table);
            sharedTablesRolls.add(new WeightedChanceItem(temp.getId(),temp.getAmount(),sharedTableWeights[i]));
        }
        //make a copy of our table and add shared table rolls with their weights into it
        List<WeightedChanceItem> tempCopy = new ArrayList<>(Arrays.asList(table));
        tempCopy.addAll(sharedTablesRolls);

        //build our rewards list
        List<Item> rewards = new ArrayList<>();
        rewards.addAll(Arrays.asList(always));
        rewards.add(RandomFunction.rollWeightedChanceTable(tempCopy));
        rewards.addAll(RandomFunction.rollChanceTable(false,charms));

        tempCopy.clear();
        return rewards;
    }
}
