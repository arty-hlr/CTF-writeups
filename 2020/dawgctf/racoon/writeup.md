This was an easy pwn that really didn't require any reversing or pwning abilities, but some scripting was in order.

The binary gives us an easy menu:

```
Timmy: Welcome!
How can I help you today?
1. I want to sell
2. What's for sale?
3. See you later.
```

where we can either sell things we have:

```
Of course! What exactly are you
offering?
1. flimsy axe - chop chop chop Price: 800 bells
2. olive flounder - it's looking at me funny Price: 800 bells
3. slingshot - the closest thing you can get to a gun Price: 900 bells
4. flimsy shovel - for digging yourself out of debt Price: 800 bells
```

or buy other stuff:

```
8500 bells
Timmy: Here's what we have to sell today.
1. flimsy net - 400 bells
2. tarantula - 8000 bells
3. slingshot - 900 bells
4. sapling - 640 bells
5. cherry - 400 bells
6. flag - 420000 bells
```

Items we sell did disappear after selling them, but the trick was noticing that items we had previously bought did not disappear, and we could then sell them infinitely. The script first sells all our items (which isn't even necessary), then buys one tarantula, and sells it over and over until we reach those 420000 bells, and buys the flag with that sweet money!
