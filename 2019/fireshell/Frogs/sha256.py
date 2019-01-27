#usr/bin/python2.7
import time
import itertools, string
import hashlib
import sys
import signal
import threading

info = """
  Name            : Python sha256 Brute-force
"""
done = False
def signal_handler(signal, frame):
    print 'You pressed Ctrl+C!'
    global done
    done=True
    sys.exit(0)
def animate():
    for c in itertools.cycle(['|', '/', '-', '\\']):
        if done==True:
            break

        # sys.stdout.write('\rloading ' + c)
        # sys.stdout.flush()
        time.sleep(0.1)



def _attack(chrs, inputt):
    # print "[+] Start Time: ", time.strftime('%H:%M:%S')
    start_time = time.time()
    t = threading.Thread(target=animate)
    t.start()
    total_pass_try=0
    for n in range(1, 31+1):
      characterstart_time = time.time()
      print "\n[!] I'm at ", n , "-character"


      for xs in itertools.product(chrs, repeat=n):

          saved = ''.join(xs)
          stringg = saved
          m = hashlib.sha256()
          m.update(saved)
          total_pass_try +=1
          if m.hexdigest()[-6:] == inputt[-6:]:
              time.sleep(10)
              global done
              done = True

              print "\n[!] found ", stringg
              # print "\n[-] End Time: ", time.strftime('%H:%M:%S')
              # print "\n[-] Total Keyword attempted: ", total_pass_try
              # print("\n---sha256 cracked at %s seconds ---" % (time.time() - start_time))
              return stringg


      # print "\n[!]",n,"-character finished in %s seconds ---" % (time.time() - characterstart_time)



def main(toCrack):
    # print info

    chrs = string.printable.replace(' \t\n\r\x0b\x0c', '')
    # print chrs
    signal.signal(signal.SIGINT, signal_handler)
    return _attack( chrs, toCrack );



if __name__ == "__main__":
    main()
