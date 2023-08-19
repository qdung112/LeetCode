public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = Integer.MIN_VALUE;
        List<Boolean> list = new ArrayList<Boolean>(candies.length);
        //find the largest number in the array
        for(int i=0; i<candies.length; i++) {
            if(largest < candies[i]) {
                largest = candies[i];
            }
        }
        //checking if kids will have greatest no. of candies
        for(int candy : candies) {
            if(candy + extraCandies >= largest) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
